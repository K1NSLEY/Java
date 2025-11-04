// pages/index.js
import React, { useMemo } from 'react';
import Head from 'next/head';

// URL da API
const API_URL = 'http://localhost:8080/api/v1/carros';

// --- 1. Funções de Utilitário Sênior (Separação de Responsabilidades) ---

/**
* @typedef {object} Carro
* @property {number} id
* @property {number} ano
* @property {string} marca
* @property {string} modelo
* @property {string} motor
* @property {string} combustivel
* @property {string} cor
* @property {string} transmissao
* @property {'Novo' | 'Usado'} status
* @property {number} consumoCidade
* @property {number} preco
* @property {number} consumoEstrada
*/

/**
* Função responsável por buscar os dados da API.
* @returns {Promise<Carro[] | null>} Lista de carros ou null em caso de falha.
*/
async function getCarros() {
try {
const response = await fetch(API_URL);

if (!response.ok) {
// Loga o erro no servidor, mas retorna null para o front-end
console.error(`Falha ao buscar dados: Status ${response.status}`);
return null;
}

const data = await response.json();
return data;
} catch (error) {
// Loga erro de rede no servidor
console.error('Erro de rede durante a busca de carros:', error);
return null;
}
}

// --- 2. Componente de Renderização de Tabela (Componentização) ---

/**
* Componente funcional puro para renderizar a tabela.
* @param {{ carros: Carro[] }} props
*/
const CarrosTable = ({ carros }) => {
if (carros.length === 0) {
return <p className="info">Nenhum carro encontrado com os critérios de filtro/ordenação.</p>;
}

// Define as colunas visíveis e seus títulos
const colunas = [
{ key: 'ano', titulo: 'Ano' },
{ key: 'marca', titulo: 'Marca' },
{ key: 'modelo', titulo: 'Modelo' },
{ key: 'status', titulo: 'Status' },
{ key: 'preco', titulo: 'Preço (R$)' },
{ key: 'motor', titulo: 'Motor' },
{ key: 'transmissao', titulo: 'Transmissão' },
{ key: 'cor', titulo: 'Cor' },
{ key: 'consumoCidade', titulo: 'Consumo Cidade (km/l)' },
{ key: 'consumoEstrada', titulo: 'Consumo Estrada (km/l)' },
];

const formatarValor = (key, valor) => {
if (key === 'preco') {
return valor.toLocaleString('pt-BR', { style: 'currency', currency: 'BRL' });
}
return valor;
};

return (
<div className="tabela-responsiva">
    <table>
        <thead>
        <tr>
            {colunas.map((coluna) => (
            <th key={coluna.key}>{coluna.titulo}</th>
            ))}
        </tr>
        </thead>
        <tbody>
        {carros.map((carro) => (
        <tr key={carro.id} className={carro.status === 'Novo' ? 'novo' : 'usado'}>
        {colunas.map((coluna) => (
        <td
                key={`${carro.id}-${coluna.key}`}
                className={coluna.key === 'preco' ? 'preco-destaque' : ''}
        >
        {formatarValor(coluna.key, carro[coluna.key])}
        </td>
        ))}
        </tr>
        ))}
        </tbody>
    </table>
</div>
);
};

// --- 3. Componente Principal (Lógica de Apresentação) ---

/**
* Componente principal da página.
* @param {{ carros: Carro[] | null, erro: boolean }} props
*/
export default function CarroVisualizador({ carros, erro }) {
// 3.1. Hook useMemo para otimizar a filtragem e ordenação (Performance)
const carrosProcessados = useMemo(() => {
if (!carros) return [];

// Lógica Sênior: Filtrar e Ordenar no cliente

// 1. Filtrar: Mostrar apenas carros "Novo"
const carrosFiltrados = carros.filter(carro => carro.status === 'Novo');

// 2. Ordenar: Ordenar os carros pelo preço em ordem crescente
const carrosOrdenados = carrosFiltrados.sort((a, b) => a.preco - b.preco);

return carrosOrdenados;
}, [carros]); // Depende apenas dos dados brutos

// 3.2. Renderização Condicional
if (erro || !carros) {
return (
<div className="container">
    <Head><title>Catálogo de Carros | Erro</title></Head>
    <h1>Catálogo de Carros 🛑</h1>
    <p className="erro">
        Erro ao carregar os dados. A API (`{API_URL}`) pode estar inacessível ou retornou um formato inválido.
    </p>
    <style jsx global>{stylesGlobal}</style>
</div>
);
}

return (
<div className="container">
    <Head>
        <title>Catálogo de Carros Novos</title>
        <meta name="description" content="Catálogo de carros novos filtrados e ordenados por preço." />
    </Head>

    <h1>Catálogo de Carros Novos (Ordenado por Preço) 💎</h1>
    <p className="sub-header">
        Total de {carrosProcessados.length} modelos **Novos** em estoque, ordenados do mais acessível ao mais caro.
    </p>

    <CarrosTable carros={carrosProcessados} />

    {/* Estilos Globais definidos com styled-jsx global */}
    <style jsx global>{stylesGlobal}</style>
</div>
);
}

// --- 4. Função de Busca no Servidor (Melhorando Performance e SEO) ---

/**
* Next.js Server-Side Rendering (SSR) data fetching.
* Executa a busca antes da página ser renderizada no servidor.
*/
export async function getServerSideProps() {
const carros = await getCarros();

if (!carros) {
return { props: { carros: null, erro: true } };
}

return {
props: {
carros, // Passa a lista de carros brutos para o componente principal
erro: false,
},
};
}


// --- 5. Estilização Profissional (Global Styles) ---

const stylesGlobal = `
/* Reset Básico para consistência */
:global(body) {
margin: 0;
padding: 0;
font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
background-color: #f4f7f6;
color: #333;
}

.container {
max-width: 1400px;
margin: 40px auto;
padding: 20px;
background-color: #fff;
border-radius: 12px;
box-shadow: 0 10px 25px rgba(0, 0, 0, 0.1);
}

h1 {
color: #1a73e8; /* Azul primário */
border-bottom: 3px solid #1a73e8;
padding-bottom: 15px;
margin-bottom: 10px;
font-size: 2em;
}

.sub-header {
color: #555;
margin-bottom: 25px;
font-size: 1.1em;
}

.erro {
color: #d9534f;
background-color: #fceae9;
border: 1px solid #d9534f;
padding: 20px;
border-radius: 6px;
font-weight: bold;
}

.tabela-responsiva {
overflow-x: auto;
border-radius: 8px;
box-shadow: 0 2px 10px rgba(0, 0, 0, 0.05);
}

table {
width: 100%;
border-collapse: collapse;
min-width: 900px; /* Garante que a tabela tenha um tamanho mínimo */
}

th, td {
padding: 15px;
text-align: left;
border-bottom: 1px solid #eee;
font-size: 0.95em;
}

th {
background-color: #1a73e8;
color: white;
font-weight: 600;
text-transform: uppercase;
position: sticky; /* Sticky headers para UX */
top: 0;
}

tr:nth-child(even) {
background-color: #f8f8f8;
}

tr:hover {
background-color: #e6f7ff; /* Destaque ao passar o mouse */
cursor: default;
}

.novo {
/* Mantido simples, mas podemos adicionar um pequeno badge ou cor */
}

.usado {
/* Não aparece na versão filtrada, mas útil se o filtro for removido */
}

.preco-destaque {
font-weight: 700;
color: #008000; /* Cor verde forte para preços */
font-size: 1.05em;
}
`;