-- phpMyAdmin SQL Dump
-- version 4.8.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 18, 2019 at 08:20 AM
-- Server version: 10.1.34-MariaDB
-- PHP Version: 7.2.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `blood_donate`
--

-- --------------------------------------------------------

--
-- Table structure for table `donar_info`
--

CREATE TABLE `donar_info` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `department` varchar(255) NOT NULL,
  `phone` varchar(255) NOT NULL,
  `blood_group` varchar(255) NOT NULL,
  `last_date` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `donar_info`
--

INSERT INTO `donar_info` (`id`, `name`, `department`, `phone`, `blood_group`, `last_date`) VALUES
(1, 'Pranta Biswas', 'CSE', '01303018975', 'A+', 'November'),
(2, 'Silvia', 'CSE', '01783435403', 'AB+', 'January'),
(3, 'amir', 'CSE', '01783708185', 'A+', 'February'),
(4, 'amantu', 'CSE', '01783708185', 'A+', 'March'),
(5, 'amantu Amir', 'CSE', '01628438704', 'A+', 'April'),
(6, 'asif', 'CSE', '017xxxxxxxx', 'A+', 'May'),
(7, 'arman', 'CSE', '017xxxxxxxx', 'O+', 'June'),
(8, 'Ripon', 'CSE', '017xxxxxxxx', 'B+', 'July'),
(9, 'Solaiman', 'CSE', '017xxxxxxxx', 'O+', 'August'),
(10, 'Sajib', 'LAW', '017xxxxxxxx', 'AB+', 'September'),
(12, 'Rahat', 'Chemistry', '017xxxxxxxx', 'O-', 'January');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `donar_info`
--
ALTER TABLE `donar_info`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `donar_info`
--
ALTER TABLE `donar_info`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
