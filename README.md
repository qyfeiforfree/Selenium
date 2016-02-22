# Selenium +testNG+idea
1.git

安装git win客户端（linux请使用 yum install git等安装）
一路next

2.gradle

下载gradle.zip包，解压后
添加环境变量GRADLE_HOME=解压目录 例如：D:\gradle-2.10
将%GRADLE_HOME%\bin添加到环境变量path中


3.gradle配置

build文件配置

group 'Selenium'
version '1.0-SNAPSHOT'

task wrapper(type: Wrapper) {
  gradleVersion = '2.5'
  distributionUrl = "https://services.gradle.org/distributions/gradle-$gradleVersion-all.zip"
}

apply plugin: 'java'
apply plugin: 'idea'
apply plugin: 'war'
//支持jdk版本
sourceCompatibility = 1.7

repositories {
    mavenCentral()
}
//依赖包
dependencies {
    compile 'org.testng:testng:6.9.10'
    compile group: 'org.seleniumhq.selenium', name: 'selenium-java', version: '2.+'
    compile group: 'commons-io', name: 'commons-io', version: '1.3.+'
    compile group: 'org.slf4j', name: 'slf4j-api', version: '1.7.+'
    compile group: 'net.sf.opencsv', name: 'opencsv', version: '2.+'
    testCompile group: 'junit', name: 'junit', version: '4.+'
}
//使用testng.xml作为配置文件
test {
    useTestNG(){
        options.suites("testng.xml")
        useDefaultListeners = true
    }
}
//使用UTF-8编码
tasks.withType(JavaCompile) {
    options.encoding = "UTF-8"
}

设置完成后执行

gradle clean   dependencies

4.jenkins配置

4.1.安装jdk和tomcat

4.2.将下载的war包放入webapp目录

4.3.进入localhost:8080  

4.4.汉化

建议chrome浏览器，点击左下角

选择中文简体后提交，刷新页面即可

4.5安装插件

系统管理-插件管理，搜索git和gradle插件

4.6配置JDK、git、gradle

系统管理-系统设置

4.7.新建项目

a.自由风格项目

b.项目名称

c.源码管理

d.构建定时

0 * * * *
每小时触发一次

e.gradle构建命令

clean build
