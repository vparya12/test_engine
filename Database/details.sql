-- phpMyAdmin SQL Dump
-- version 4.1.6
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Oct 25, 2014 at 08:52 PM
-- Server version: 5.6.16
-- PHP Version: 5.5.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `details`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
  `First Name` char(20) NOT NULL,
  `Last Name` char(20) NOT NULL,
  `Email` varchar(30) NOT NULL,
  `Post` char(20) NOT NULL,
  `Mobile` varchar(10) NOT NULL,
  `ID` varchar(12) NOT NULL,
  `Password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`First Name`, `Last Name`, `Email`, `Post`, `Mobile`, `ID`, `Password`) VALUES
('Er. Ved', 'Prakash Arya', 'vparya12@gmail.com', 'Admin', '8569051157', 'Admin', 'Admin'),
('Sonu', 'Kumar', 'info.bepositive379@gmail.com', 'Admin', '9988872741', '1244020', '1244020'),
('Ved Prakash', 'Arya', 'vedhearttrick@gmail.com', 'Admin', '8568849926', 'Chetak', 'VedPrakashArya');

-- --------------------------------------------------------

--
-- Table structure for table `students`
--

CREATE TABLE IF NOT EXISTS `students` (
  `First Name` char(20) NOT NULL,
  `Last Name` char(20) NOT NULL,
  `Father Name` char(40) NOT NULL,
  `Mobile` char(10) NOT NULL,
  `College` char(50) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Gender` char(8) NOT NULL,
  `Roll` bigint(12) NOT NULL,
  `Born` date NOT NULL,
  `State` char(20) NOT NULL,
  `Branch` varchar(30) NOT NULL,
  `Intrest` char(8) NOT NULL,
  `Password` varchar(20) NOT NULL,
  PRIMARY KEY (`Roll`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `students`
--

INSERT INTO `students` (`First Name`, `Last Name`, `Father Name`, `Mobile`, `College`, `Email`, `Gender`, `Roll`, `Born`, `State`, `Branch`, `Intrest`, `Password`) VALUES
('amit', 'singh', 'r.n.singh', '8968866283', 'g.n.e', 'amitsinghrocks08@gmail.com', 'Male', 1243597, '1994-02-08', 'Bihar', 'Computer Science', 'Java', 'amit'),
('Ved', 'Prakash Arya', 'Baleshwar Singh', '856905115', 'GNDEC', 'vedhearttrick@gmail.com', 'Male', 1243743, '1994-09-08', 'Bihar', 'CSE', 'Java', 'Chetak'),
('Vikesh', 'Kumar', 'Arvind Kumar', '9915418648', 'GURU NANAK DEV ENGINEERING COLLEGE,LUDHIANA', 'vikesh7631@gmail.com', 'Male', 1243745, '1994-12-10', 'Bihar', 'Computer Science', 'Java', '12345'),
('Abhishek', 'kumar', 'S N Mehta', '9779804580', 'G N E Ludhiana', 'abhisekaryan6535@gmail.com', 'Male', 1243936, '1994-12-25', 'Bihar', 'Information Technology (IT)', 'Java', 'abhishek'),
('Sonu', 'Kumar', 'R.C.Mandal', '9988872741', 'GNDEC', 'info.bepositive379@gmail.com', 'Male', 1244020, '1995-01-05', 'Bihar', 'Information Technology (IT)', 'Java', 'sonukumar');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
