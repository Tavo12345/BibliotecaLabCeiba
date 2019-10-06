-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 05-10-2019 a las 20:42:29
-- Versión del servidor: 10.1.26-MariaDB
-- Versión de PHP: 7.1.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bibliotecalabceibabd`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `libro`
--

CREATE TABLE `libro` (
  `isbn` varchar(13) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `descripcion` text,
  `clasificacion` varchar(50) NOT NULL,
  `cantidad` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `libro`
--

INSERT INTO `libro` (`isbn`, `nombre`, `descripcion`, `clasificacion`, `cantidad`) VALUES
('1456', '100 años de soledad', 'Es una novela basa en una historia fantastica.', 'novela', 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `prestamo`
--

CREATE TABLE `prestamo` (
  `idprestamo` int(15) NOT NULL,
  `fechaprestamo` datetime DEFAULT NULL,
  `fechaentrega` datetime DEFAULT NULL,
  `estado` varchar(15) NOT NULL,
  `isbnlibro` varchar(13) NOT NULL,
  `cedulausuario` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `cedula` int(15) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `email` int(11) DEFAULT NULL,
  `telefono` varchar(30) DEFAULT NULL,
  `idprestamo` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `libro`
--
ALTER TABLE `libro`
  ADD PRIMARY KEY (`isbn`);

--
-- Indices de la tabla `prestamo`
--
ALTER TABLE `prestamo`
  ADD PRIMARY KEY (`idprestamo`),
  ADD KEY `fk_cedulausuario` (`cedulausuario`),
  ADD KEY `fk_isbnlibro` (`isbnlibro`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`cedula`),
  ADD KEY `fk_idprestamo` (`idprestamo`) USING BTREE;

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `prestamo`
--
ALTER TABLE `prestamo`
  MODIFY `idprestamo` int(15) NOT NULL AUTO_INCREMENT;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `prestamo`
--
ALTER TABLE `prestamo`
  ADD CONSTRAINT `fk_cedulausuario` FOREIGN KEY (`cedulausuario`) REFERENCES `usuario` (`cedula`),
  ADD CONSTRAINT `fk_isbnlibro` FOREIGN KEY (`isbnlibro`) REFERENCES `libro` (`isbn`);

--
-- Filtros para la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `fk_idprestamo` FOREIGN KEY (`idprestamo`) REFERENCES `prestamo` (`idprestamo`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
