-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tempo de Geração: Jul 15, 2013 as 02:16 PM
-- Versão do Servidor: 5.5.8
-- Versão do PHP: 5.3.5

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Banco de Dados: `hexa_crm`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE IF NOT EXISTS `cliente` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `site` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `nome` varchar(100) DEFAULT NULL,
  `tel_comercial_01` varchar(15) DEFAULT NULL,
  `tel_comercial_02` varchar(15) DEFAULT NULL,
  `contato` varchar(100) DEFAULT NULL,
  `endereco` varchar(100) DEFAULT NULL,
  `numero` varchar(80) DEFAULT NULL,
  `bairro` varchar(100) DEFAULT NULL,
  `cidade` varchar(100) DEFAULT NULL,
  `cep` varchar(14) DEFAULT NULL,
  `estado_id` int(11) DEFAULT NULL,
  `empresa_gerencia_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`id`, `site`, `email`, `nome`, `tel_comercial_01`, `tel_comercial_02`, `contato`, `endereco`, `numero`, `bairro`, `cidade`, `cep`, `estado_id`, `empresa_gerencia_id`) VALUES
(1, 'www.hexadc.com.br', 'marcio@hexadc.com.br', 'HEXADC - DEVELOPMENT AND CONSULTING', '(12)3882-1371', '(00)0000-0000', 'MARCIO LUIS R. DE P. LIMA', 'ENDERECO', '00001', 'BAIRRO', 'CARAGUTATUBA', '11.600-000', 25, 1),
(2, 'jlkjkjnhjkjjj', 'jjjjjjjoiuoi', 'MARISA', '(12)3123-1232', '(24)3423-4234', 'HKJHKJHKJH', 'KJHIUHIU', 'ihiuhiu', 'H', 'JKNKJHK', '09.809-798', 1, 2);

-- --------------------------------------------------------

--
-- Estrutura da tabela `empresa_gerencia`
--

CREATE TABLE IF NOT EXISTS `empresa_gerencia` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome_emp` varchar(80) NOT NULL,
  `contato` varchar(80) NOT NULL,
  `razao_social` varchar(80) NOT NULL,
  `cnpj` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Extraindo dados da tabela `empresa_gerencia`
--

INSERT INTO `empresa_gerencia` (`id`, `nome_emp`, `contato`, `razao_social`, `cnpj`) VALUES
(1, 'NOME', 'CONTATO', 'RAZÃO', 'CNPJ'),
(2, 'NOME 002', 'CONTATO002', 'RAZÃO SOCIAL 002', '09.807.293/8757-58'),
(3, 'NOME 003', 'CONTATO 003', 'RAZÃO SOCIAL 003', '09.453.628/3746-19');

-- --------------------------------------------------------

--
-- Estrutura da tabela `estado`
--

CREATE TABLE IF NOT EXISTS `estado` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `estado` varchar(40) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=28 ;

--
-- Extraindo dados da tabela `estado`
--

INSERT INTO `estado` (`id`, `estado`) VALUES
(1, 'ACRE - AC'),
(2, 'ALAGOAS - AL'),
(3, 'AMAPÁ - AP'),
(4, 'AMAZONAS - AM'),
(5, 'BAHIA - BA'),
(6, 'CEARÁ - CE'),
(7, 'DISTRITO FEDERAL - DF'),
(8, 'ESPÍRITO SANTO - ES'),
(9, 'GOIÁS - GO'),
(10, 'MARANHÃO - MA'),
(11, 'MATO GROSSO - MT'),
(12, 'MATO GROSSO DO SUL - MS'),
(13, 'MINAS GERAIS - MG'),
(14, 'PARÁ - PA'),
(15, 'PARAÍBA - PB'),
(16, 'PARANÁ - PR'),
(17, 'PERNAMBUCO - PE'),
(18, 'PIAUÍ - PI'),
(19, 'RIO DE JANEIRO - RJ'),
(20, 'RIO GRANDE DO NORTE - RN'),
(21, 'RIO GRANDE DO SUL - RS'),
(22, 'RONDÔNIA - RO'),
(23, 'RORAIMA - RR'),
(24, 'SANTA CATARINA - SC'),
(25, 'SÃO PAULO - SP'),
(26, 'SERGIPE - SE'),
(27, 'TOCANTINS - TO');

-- --------------------------------------------------------

--
-- Estrutura da tabela `privilegio`
--

CREATE TABLE IF NOT EXISTS `privilegio` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `tipo` varchar(30) CHARACTER SET utf8 NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Extraindo dados da tabela `privilegio`
--


-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE IF NOT EXISTS `usuario` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `nome` varchar(30) CHARACTER SET utf8 NOT NULL,
  `usuario` varchar(30) CHARACTER SET utf8 NOT NULL,
  `telefone` varchar(15) DEFAULT NULL,
  `senha` varchar(30) CHARACTER SET utf8 DEFAULT NULL,
  `acesso` varchar(255) DEFAULT NULL,
  `tipo` varchar(11) DEFAULT NULL,
  `empresa_gerencia_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`id`, `nome`, `usuario`, `telefone`, `senha`, `acesso`, `tipo`, `empresa_gerencia_id`) VALUES
(1, 'NOME USUARIO', 'LOGIN', '31232131', 'VKyerThrB56546546HP4Mhhz', 'true,true,true,true,true,true', '1', 1);
