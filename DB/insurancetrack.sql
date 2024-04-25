-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 25, 2024 at 06:01 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `insurancetrack`
--

-- --------------------------------------------------------

--
-- Table structure for table `insur`
--

CREATE TABLE `insur` (
  `id` int(20) NOT NULL,
  `name` varchar(50) NOT NULL,
  `lastname` varchar(50) NOT NULL,
  `user` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `pass` varchar(150) NOT NULL,
  `contact` varchar(50) NOT NULL,
  `type` varchar(50) NOT NULL,
  `status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `insur`
--

INSERT INTO `insur` (`id`, `name`, `lastname`, `user`, `email`, `pass`, `contact`, `type`, `status`) VALUES
(1, 'kath', 'erggggdrdgdf', 'kate', 'kathrepunte44@gmail.com', 'sdfsdfsdgfsdfsdf', 'dsffefdfeffeesee', 'Admin', 'Active'),
(2, 'rhona', 'llanto', 'rhonz', 'rhona@gmail.com', '123456789', '', 'Admin', 'Active'),
(3, 'wedwed', 'dsfd', 'dsfcd', 'ds', '745758758', 'CONTACT42558#', 'ADMIN', 'Pending'),
(4, 'rhona', 'llanto', 'ronron', 'ron@gmail.com', '123456', '09753137977', 'ADMIN', 'Pending'),
(10, 'hi', 'jil', 'test', 'ron@gmail.com', '2146578567857', '452525574', 'ADMIN', 'Pending'),
(11, 'Kim', 'Canon', 'kimyat', 'kimkim', 'kimcanon', '07536378954', 'User', 'Active'),
(38, 'jungkook', 'jeon', 'kook', 'jeon@gmail.com', 'apPCbAHbnQTs6k+AgFofhTeWZjvUfkJAQR9MWeAJMnE=', '09753137977', 'ADMIN', 'Pending'),
(40, 'kath', 'moran', 'kath', 'moran@gmail.com', 'zDHmzFmtCh8rlnVIcvwh8Sg4e4YzFYXDvNtFA0oUwyI=', '09753137977', 'User', 'Active'),
(41, 'Gleen', 'Llanto', 'kgleen', 'lemoneras', 'X4gTRHTrBamjkH0htiY/hdYxV7tL/mZD8CtG9qfFtQs=', '09533919501', 'Admin', 'Active'),
(42, 'User ID', 'lemon', 'ronz', 'lemona', '123123321', '098533129875', 'User', 'Active'),
(43, 'pau', 'palu', 'jinz', 'deddddd', 'X4gTRHTrBamjkH0htiY/hdYxV7tL/mZD8CtG9qfFtQs=', 'CONTACT#', 'USER', 'Pending');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `insur`
--
ALTER TABLE `insur`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `insur`
--
ALTER TABLE `insur`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=44;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
