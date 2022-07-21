package org.example.example2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
//для mustache нужно поменять расширение файла с html на mustache  код:
/*

<!DOCTYPE HTML>
<html>
<head>
    <title>Getting Started: Serving Web Content</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
<div>Hello, {{name}}</div>
</body>
</html>
 */
// адрес папки с бд C:\Program Files\PostgreSQL\14\data\base\16394