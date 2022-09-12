CREATE DATABASE  IF NOT EXISTS `test` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `test`;
-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: test
-- ------------------------------------------------------
-- Server version	8.0.30

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (1);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `movies`
--

LOCK TABLES `movies` WRITE;
/*!40000 ALTER TABLE `movies` DISABLE KEYS */;
INSERT INTO `movies` VALUES (1,'Sau các sự kiện của Avengers: Endgame, Tiến sĩ Stephen Strange tiếp tục nghiên cứu về Viên đá Thời gian. Nhưng một người bạn cũ đã trở thành kẻ thù tìm cách tiêu diệt mọi phù thủy trên Trái đất, làm xáo trộn kế hoạch của Strange và cũng khiến anh ta mở ra một tội ác khôn lường.','PHÙ THỦY TỐI THƯỢNG TRONG ĐA VŨ TRỤ HỖN LOẠN','https://khenphim.com/wp-content/uploads/2022/05/Doctor-Strange-madness-1-poster_KP.webp'),(2,'Minions: Sự trỗi dậy của Gru là một bộ phim hoạt hình máy tính hài của Mỹ năm 2022 do Illumination sản xuất và được phân phối bởi Universal Pictures. Đây là phần tiếp theo của phần phim ngoại truyện Minions và là phần thứ năm nói chung trong loạt phim Kẻ trộm mặt trăng.','Minions: Sự trỗi dậy của Gru','https://m.media-amazon.com/images/M/MV5BZDQyODUwM2MtNzA0YS00ZjdmLTgzMjItZWRjN2YyYWE5ZTNjXkEyXkFqcGdeQXVyMTI2MzY1MjM1._V1_.jpg'),(3,'Phim nói về hành trình của một nhóm người cùng nhau sinh tồn và cố gắng thoát khỏi sự truy đuổi của xác sống để đến chuyến phà cuối cùng tại một cù lao trên vùng hạ lưu sông Mekong khi đại dịch xác sống bùng nổ. Công - một thầy thuốc đông y nhưng đã mất đi niềm tin vào tình người, quyết định đưa cha mình và con gái tìm đường rời đi. Trong quá trình chạy trốn, họ thất lạc nhau, Công hoang mang đi tìm đứa con gái rồi vô tình gặp được một gia đình hiền lành, hai chàng trai ma lanh, đôi bạn trẻ lương thiện và một người đàn ông có trái tim dũng cảm. Họ cùng nhau hợp sức thành một nhóm chống trả để giành giật sự sống. Đúng lúc này, sự tị hiềm, tham lam, ích kỷ của lòng người nảy sinh và lại đẩy họ vào những thử thách sống còn. Liệu hành trình của nhóm người này sẽ đi về đâu khi đại dịch càng ngày càng lan rộng?','CÙ LAO XÁC SỐNG','http://starlight.vn/Areas/Admin/Content/Fileuploads/images/POSTER/cu-lao-xac-song.jpg'),(4,'Bộ phim kể về Kya Clark - một cô gái bị gia đình bỏ rơi, lớn lên ở vùng đầm lầy phía nam thị trấn Barkley Cove vào những năm 50. Khi cảnh sát của thị trấn bị phát hiện đã qua đời, người ta bắt đầu dồn mọi mối nghi ngờ vào Kya','XA NGOÀI KIA NƠI LOÀI TÔM HÁT','https://channel.mediacdn.vn/thumb_w/640/428462621602512896/2022/8/31/photo-1-1661943983251985531984.jpg');
/*!40000 ALTER TABLE `movies` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `rooms`
--

LOCK TABLES `rooms` WRITE;
/*!40000 ALTER TABLE `rooms` DISABLE KEYS */;
INSERT INTO `rooms` VALUES (1,'Tầng 1 phòng 101',70,'Phòng chiếu A1'),(2,'Tầng 1 phòng 102',50,'Phòng chiếu A2');
/*!40000 ALTER TABLE `rooms` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `showtime`
--

LOCK TABLES `showtime` WRITE;
/*!40000 ALTER TABLE `showtime` DISABLE KEYS */;
INSERT INTO `showtime` VALUES (1,1,1,25,'1','2022-07-05'),(2,2,1,2,'2','2022-07-05'),(3,1,2,3,'3','2022-07-05');
/*!40000 ALTER TABLE `showtime` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tickets`
--

LOCK TABLES `tickets` WRITE;
/*!40000 ALTER TABLE `tickets` DISABLE KEYS */;
INSERT INTO `tickets` VALUES (1,1,2),(2,1,1),(3,1,3),(4,2,3);
/*!40000 ALTER TABLE `tickets` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `timezone`
--

LOCK TABLES `timezone` WRITE;
/*!40000 ALTER TABLE `timezone` DISABLE KEYS */;
INSERT INTO `timezone` VALUES (1,'09:30:00','07:00:00'),(2,'12:00:00','09:30:00'),(3,'14:30:00','12:00:00'),(4,'17:00:00','14:30:00'),(5,'19:30:00','17:00:00'),(6,'22:00:00','19:30:00'),(7,'24:30:00','22:00:00');
/*!40000 ALTER TABLE `timezone` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'a','patrick','$2a$10$cTUErxQqYVyU2qmQGIktpup5chLEdhD2zpzNEyYqmxrHHJbSNDOG.','patrick',0),(2,'b@gmail.com','alex','$2a$10$.tP2OH3dEG0zms7vek4ated5AiQ.EGkncii0OpCcGq4bckS9NOULu','alex',0),(3,'c@gmail.com','john','$2a$10$E2UPv7arXmp3q0LzVzCBNeb4B4AtbTAGjkefVDnSztOwE7Gix6kea','join',0),(4,'d@gmail.com','namhm','$2a$10$GQT8bfLMaLYwlyUysnGwDu6HMB5G.tin5MKT/uduv2Nez0.DmhnOq','namhm',0),(5,'e@gmail.com','admin','$2a$10$IqTJTjn39IU5.7sSCDQxzu3xug6z/LPU6IF0azE/8CkHCwYEnwBX.','admin',1);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-09-12 15:32:45
