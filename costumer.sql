-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 27-07-2023 a las 19:30:40
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.0.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `mylibrary`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `costumer`
--

CREATE TABLE `costumer` (
  `doc_ident` int(10) NOT NULL,
  `doc_type` varchar(55) COLLATE utf8_spanish_ci NOT NULL,
  `name` varchar(55) COLLATE utf8_spanish_ci NOT NULL,
  `last_name` varchar(55) COLLATE utf8_spanish_ci NOT NULL,
  `email` varchar(55) COLLATE utf8_spanish_ci NOT NULL,
  `class` varchar(55) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `costumer`
--

INSERT INTO `costumer` (`doc_ident`, `doc_type`, `name`, `last_name`, `email`, `class`) VALUES
(123456, 'cedulña', 'luis', 'torres', 'luiscure2@hdw', 'globant');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `costumer`
--
ALTER TABLE `costumer`
  ADD PRIMARY KEY (`doc_ident`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
