-- phpMyAdmin SQL Dump
-- version 4.1.6
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Oct 25, 2014 at 08:54 PM
-- Server version: 5.6.16
-- PHP Version: 5.5.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `result`
--

-- --------------------------------------------------------

--
-- Table structure for table `cpp`
--

CREATE TABLE IF NOT EXISTS `cpp` (
  `Roll` bigint(20) NOT NULL,
  `FirstQ` int(5) NOT NULL,
  `SecQ` int(5) NOT NULL,
  `ThirdQ` int(5) NOT NULL,
  `FourthQ` int(5) NOT NULL,
  `FifthQ` int(5) NOT NULL,
  `Ans1` varchar(50) NOT NULL,
  `Ans2` varchar(50) NOT NULL,
  `Ans3` varchar(50) NOT NULL,
  `Ans4` varchar(50) NOT NULL,
  `Ans5` varchar(50) NOT NULL,
  `Obtain Marks` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `html`
--

CREATE TABLE IF NOT EXISTS `html` (
  `Roll` bigint(20) NOT NULL,
  `FirstQ` int(5) NOT NULL,
  `SecQ` int(5) NOT NULL,
  `ThirdQ` int(5) NOT NULL,
  `FourthQ` int(5) NOT NULL,
  `FifthQ` int(5) NOT NULL,
  `Ans1` varchar(50) NOT NULL,
  `Ans2` varchar(50) NOT NULL,
  `Ans3` varchar(50) NOT NULL,
  `Ans4` varchar(50) NOT NULL,
  `Ans5` varchar(50) NOT NULL,
  `Obtain Marks` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `java`
--

CREATE TABLE IF NOT EXISTS `java` (
  `Roll` bigint(20) NOT NULL,
  `FirstQ` int(5) NOT NULL,
  `SecQ` int(5) NOT NULL,
  `ThirdQ` int(5) NOT NULL,
  `FourthQ` int(5) NOT NULL,
  `FifthQ` int(5) NOT NULL,
  `Ans1` varchar(50) NOT NULL,
  `Ans2` varchar(50) NOT NULL,
  `Ans3` varchar(50) NOT NULL,
  `Ans4` varchar(50) NOT NULL,
  `Ans5` varchar(50) NOT NULL,
  `Obtain Marks` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `javascript`
--

CREATE TABLE IF NOT EXISTS `javascript` (
  `Roll` bigint(20) NOT NULL,
  `FirstQ` int(5) NOT NULL,
  `SecQ` int(5) NOT NULL,
  `ThirdQ` int(5) NOT NULL,
  `FourthQ` int(5) NOT NULL,
  `FifthQ` int(5) NOT NULL,
  `Ans1` varchar(50) NOT NULL,
  `Ans2` varchar(50) NOT NULL,
  `Ans3` varchar(50) NOT NULL,
  `Ans4` varchar(50) NOT NULL,
  `Ans5` varchar(50) NOT NULL,
  `Obtain Marks` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `php`
--

CREATE TABLE IF NOT EXISTS `php` (
  `Roll` bigint(20) NOT NULL,
  `FirstQ` int(5) NOT NULL,
  `SecQ` int(5) NOT NULL,
  `ThirdQ` int(5) NOT NULL,
  `FourthQ` int(5) NOT NULL,
  `FifthQ` int(5) NOT NULL,
  `Ans1` varchar(50) NOT NULL,
  `Ans2` varchar(50) NOT NULL,
  `Ans3` varchar(50) NOT NULL,
  `Ans4` varchar(50) NOT NULL,
  `Ans5` varchar(50) NOT NULL,
  `Obtain Marks` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `python`
--

CREATE TABLE IF NOT EXISTS `python` (
  `Roll` bigint(20) NOT NULL,
  `FirstQ` int(5) NOT NULL,
  `SecQ` int(5) NOT NULL,
  `ThirdQ` int(5) NOT NULL,
  `FourthQ` int(5) NOT NULL,
  `FifthQ` int(5) NOT NULL,
  `Ans1` varchar(50) NOT NULL,
  `Ans2` varchar(50) NOT NULL,
  `Ans3` varchar(50) NOT NULL,
  `Ans4` varchar(50) NOT NULL,
  `Ans5` varchar(50) NOT NULL,
  `Obtain Marks` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
