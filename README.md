# Selenium +testNG+idea+gradle自动化测试环境搭建

##1、IDEA安装
##2、gradle安装
##3、gradle配置
group 'Selenium'
version '1.0-SNAPSHOT'

task wrapper(type: Wrapper) {
  gradleVersion = '2.5'
  distributionUrl = "https://services.gradle.org/distributions/gradle-$gradleVersion-all.zip"
}

apply plugin: 'java'
apply plugin: 'idea'
apply plugin: 'war'

sourceCompatibility = 1.8

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
//使用testng.xml
test {
    useTestNG(){
        options.suites("testng.xml")
        useDefaultListeners = true
    }
}
//中文乱码
tasks.withType(JavaCompile) {
    options.encoding = "UTF-8"
}
##4、testNG配置
##5、testng.xml配置
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd" >
<suite name="SeleniumTest" parallel="false">
    <test name="SeleniumTestCase">
        <classes>
            <class name="org.qiyanfei.SeleniumTest.SeleniumTest"/>
            <class name="org.qiyanfei.SeleniumTest.SeleniumTestCase1"/>
        </classes>
    </test>
</suite>
