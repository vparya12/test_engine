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
-- Database: `question`
--

-- --------------------------------------------------------

--
-- Table structure for table `cpp`
--

CREATE TABLE IF NOT EXISTS `cpp` (
  `Q` varchar(100) NOT NULL,
  `A` varchar(100) NOT NULL,
  `B` varchar(100) NOT NULL,
  `C` varchar(100) NOT NULL,
  `D` varchar(100) NOT NULL,
  `Ans` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cpp`
--

INSERT INTO `cpp` (`Q`, `A`, `B`, `C`, `D`, `Ans`) VALUES
('The process of building new classes from existing one is called ______.', 'Polymorphism', 'Structure.', ' Inheritance.', 'Cascading', ' Inheritance.'),
('RunTime Polymorphism is achieved by ______ ', ' friend function.', 'virtual function', ' operator overloading.', ' function overloading.', 'virtual function'),
('In C++, dynamic memory allocation is accomplished with the operator ____ ', ' new.', ' this.', ' malloc()', 'delete', ' new.'),
('If we create a file by ‘ifstream’, then the default mode of the file is ', ' ios :: out', ' ios :: in', ' ios :: app', ' ios :: binary', ' ios :: in'),
('The break statement causes an exit from ', ' from the innermost loop only.', ' only from the innermost switch', ' from all loops & switches.', ' from the innermost loop or switch', ' from the innermost loop or switch'),
('The operator that cannot be overloaded is ', '++', '::', '()', '~', '::'),
('Use of virtual functions implies ', ' overloading', 'overriding', 'static binding.', 'dynamic binding.', 'dynamic binding.'),
('The members of a class, by default, are ', 'public.', 'protected.', 'private', 'mandatory to specify', 'private'),
('The null character will take space of', '0 byte', '2 byte', '8 byte', '1 byte', '1 byte'),
('Keywords support dynamic method of resolution is', 'abstract', 'Virtual', 'Dynamic', 'Typeid', 'Virtual'),
('Inventor of C++ language is', 'John Dell', 'Bjarne Stroustrup', 'Bjarne Stroustrup', 'Karl Thomus', 'Bjarne Stroustrup');

-- --------------------------------------------------------

--
-- Table structure for table `html`
--

CREATE TABLE IF NOT EXISTS `html` (
  `Q` varchar(100) NOT NULL,
  `A` varchar(100) NOT NULL,
  `B` varchar(100) NOT NULL,
  `C` varchar(100) NOT NULL,
  `D` varchar(100) NOT NULL,
  `Ans` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `html`
--

INSERT INTO `html` (`Q`, `A`, `B`, `C`, `D`, `Ans`) VALUES
('How can you make a list that lists the items with numbers?', '<dl>', '<ol>', '<list>', '<ul>', '<ol>'),
('Which colors consist of equal amounts of all basic colors ?', 'purple, green, and red', 'black, blue, and gray', 'white, black and gray', 'none', 'white, black and gray'),
('Choose the correct HTML tag for the largest heading', ' <heading>', '<h6>', '<head>', '<h1>', '<h1>'),
('Choose the correct HTML to left-align the content inside a tablecell', '<td valign="left">', '<tdleft>', '<td align="left">', '<td leftalign>', '<td align="left">'),
('What does vlink mean ?', 'visited link', 'very good link', 'active link', 'valid link', 'visited link'),
('<a> and </a> are the tags used for ?', 'Audio-voiced text', 'Adding links to your page', ' Aligning text', 'active a non active link', 'Adding links to your page'),
('Who is known as the father of WWW (World Wide Web) ?', 'Charles Darwin', 'Tim Thompson', 'Tim Berners-Lee', '	 Robert Cailliau', 'Tim Berners-Lee'),
('What is the traditional file name of a homepage of a website??', 'home.html', 'index.html', 'web.html', 'front.html', 'index.html'),
('What is the basic fundamental block of an HTML page?', 'HTML Element', 'HTML Body', 'HTML Attribute', 'HTML tag', 'HTML tag'),
('Which one among these connects web pages?', 'link', 'connector', 'hyperlink', 'none', 'hyperlink'),
('HTML is the subset of', 'SGML', 'SGMT', 'SGMD', 'NONE', 'SGML');

-- --------------------------------------------------------

--
-- Table structure for table `java`
--

CREATE TABLE IF NOT EXISTS `java` (
  `Q` varchar(100) NOT NULL,
  `A` varchar(100) NOT NULL,
  `B` varchar(200) NOT NULL,
  `C` varchar(200) NOT NULL,
  `D` varchar(200) NOT NULL,
  `Ans` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `java`
--

INSERT INTO `java` (`Q`, `A`, `B`, `C`, `D`, `Ans`) VALUES
('JAR stands for?', 'Java Archive', 'Java Archive Runner', 'Java Application Runner', ' None of the above', 'Java Archive'),
(' ___________ is a name given to a variable, class or method', 'Constant', 'Reference', 'Identifier', 'Modifier', 'Identifier'),
('Which class cannot be a subclass in java?', 'abstract class', 'parent class', 'Final class', 'None of above', 'Final class'),
('Why we use array as a parameter of main method?', 'it is syntax   ', 'Can store multiple values', 'Both of above', 'None of above', 'Can store multiple values'),
('Suspend thread can be revived by using', 'start() method', 'Suspend() method', 'resume() method', 'yield() method', 'resume() method'),
('Runnable is', 'Class', 'Method', 'Variable', 'Interface', 'Interface'),
('Construstor inisialise when ________ is created?', 'class', 'object', 'mathod', 'static method', 'object'),
('JVM stand for?', 'Java Virtual Machine', 'Java Virtual Memeory', 'Java Valid Machine', 'None', 'Java Virtual Machine'),
('Which of these are Correct Statement?', 'System.out("Hey");', 'System.out.print("Hey");', 'System.out(Hey)', 'None', 'System.out.print("Hey");'),
('Why we use supe keyword ?', 'To call Parent class const.', 'To call main', 'To call const. of same class', 'None Of these', 'To call Parent class const.'),
('which pakage is use of Input utput function?', 'java,IO.*;', 'java.Object.*;', 'java.lang.*;', 'None Of these', 'java,IO.*;'),
('What was the Old name of Java?', 'Oracle', 'Oak', 'Sun Micro', 'Oracle Java', 'Oak');

-- --------------------------------------------------------

--
-- Table structure for table `javascript`
--

CREATE TABLE IF NOT EXISTS `javascript` (
  `Q` varchar(100) NOT NULL,
  `A` varchar(100) NOT NULL,
  `B` varchar(100) NOT NULL,
  `C` varchar(100) NOT NULL,
  `D` varchar(100) NOT NULL,
  `Ans` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `javascript`
--

INSERT INTO `javascript` (`Q`, `A`, `B`, `C`, `D`, `Ans`) VALUES
('Javascript is ________________ Side Scripting language.', 'Server', 'Browser', 'ISP', 'None of Thse', 'Browser'),
('Javascript is ________________  language.', 'Programming', 'Application', 'Scripting', 'None of Thse', 'Scripting'),
('Javascript codeis written inside file having extension ____________.', '.javascript', '.jvs', '.jsc', '.js', '.js'),
('Javascript code can be called by using', 'RMI', 'Preprocessor', 'Function/Method', 'None', 'Function/Method'),
('The async attribute can be set in the follong ways-', '<script a="async">', '<script async>', '<script async="">', 'None of These', 'None of These'),
('Which was the First browser to support JavaScript?', 'IE', 'Google Chrome', 'Netscape', 'Morzilla FireFox', 'Netscape'),
('Cost for using javascript in html is?', 'Its Free!!', '$10 / year', '$5 /year', '$15 / year', 'Its Free!!'),
('JavaScript code can be called by using .', 'preprocessor', 'triggering event', 'Function', 'RMI', 'triggering event'),
('______Attribute is used to specified specify the character encoding used in external script file.', 'type ', ' charset', 'character', 'none', ' charset'),
('Which tag is use for javascript to use in HTML', 'script', 'body', 'java', 'head', 'script'),
('Choose server side javascript object?', 'FileUpLoad', 'Function', 'File', 'Date', 'File');

-- --------------------------------------------------------

--
-- Table structure for table `php`
--

CREATE TABLE IF NOT EXISTS `php` (
  `Q` varchar(100) NOT NULL,
  `A` varchar(100) NOT NULL,
  `B` varchar(100) NOT NULL,
  `C` varchar(100) NOT NULL,
  `D` varchar(100) NOT NULL,
  `Ans` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `php`
--

INSERT INTO `php` (`Q`, `A`, `B`, `C`, `D`, `Ans`) VALUES
('Which of the following functions do not return a timestamp? ', 'time()', 'date()', ' strtotime()', ' localtime()', 'date()'),
('The ......... function parses an English textual date or time into a Unix timestamp ', 'strtodate()', 'stroftime()', 'strtotime()', 'str_to_time()', 'strtotime()'),
('The getdate() function returns', 'An integer', 'A floating-point number', 'An array', ' A Boolean', 'An array'),
(' Trace the function that does continue the script execution even if the file inclusion fails', ' include ()', 'require ()', 'both of above', ' None of above', ' include ()'),
(' The left associative dot operator (.) is used in PHP for', ' multiplication', 'concatenation', 'separate object and its member', 'delimeter', 'concatenation'),
(' Identify the variable scope that is not supported by PHP', ' Local variables', ' Function parameters', 'Hidden variables', 'Global variables', 'Hidden variables'),
('Which of the following variables is not a predefined variable?', '$get', '$ask', '$request', '$post', '$ask'),
('fopen($file_doc,”r+&rdquoWink opens a file for', 'reading', 'writing', 'none ', 'both ', 'both '),
('Which of the following method sends input to a script via a URL?', 'Get', 'Post', 'none', 'both', 'Get'),
('mysql_connect( ) does not take following parameter', 'database host', 'user ID', 'password', 'database name', 'database name'),
('Which of the following function can assign the output to a string variable', ' echo ( )', ' print ( )', ' printf( )', ' sprintf ( )', ' sprintf ( )');

-- --------------------------------------------------------

--
-- Table structure for table `python`
--

CREATE TABLE IF NOT EXISTS `python` (
  `Q` varchar(100) NOT NULL,
  `A` varchar(100) NOT NULL,
  `B` varchar(100) NOT NULL,
  `C` varchar(100) NOT NULL,
  `D` varchar(100) NOT NULL,
  `Ans` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `python`
--

INSERT INTO `python` (`Q`, `A`, `B`, `C`, `D`, `Ans`) VALUES
('Which of these in not a core datatype?', 'Lists', 'Dictionary', 'Tuples', 'Class', 'Class'),
('What is the return type of function id ?', 'int', 'bool', 'float', 'dist', 'int'),
('What is the return value of trunc() ?', 'int', 'bool', 'float', 'None', 'int'),
('What is the key to scroll forward in the command history on Windows and Linux?', 'Alt + F', 'Ctrl + F', 'Ctrl + N', 'Alt + N', 'Alt + N'),
('x = 4.5 ,y = 2, print x//y', '2.0', '2.25', '9', '21.0', '2.0'),
('What would len(2 ** 1000000) print in python?', 'Stack Overflow', 'Print The Value', 'count the digit', 'None', 'count the digit'),
('What are the keys to scroll and get the previous command executed', 'ALT+P', 'ALT+L', 'CTRL+P', 'CTRL+L', 'ALT+P'),
('To read the remaining lines of the file from a file object infile, we use', 'nfile.read(2)', 'infile.read()', 'infile.readline()', 'infile.readlines()', 'infile.readlines()'),
('The readlines() method returns', 'str', 'a list of lines', ' single characters', 'a list of integers', 'a list of lines'),
('To read two characters from a file object infile, we use', 'infile.read(2)', 'infile.read()', 'infile.readline()', 'infile.readlines()', 'infile.read(2)');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
