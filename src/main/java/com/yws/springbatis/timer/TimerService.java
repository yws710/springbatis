package com.yws.springbatis.timer;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 简单定时任务 <br>
 * 1.在启动类上使用@EnableScheduling注解； <br>
 * 2.在任务方法上使用@Schedule注解。 <br>
 * @author Administrator
 *
 */
//@Component
public class TimerService {
	
	private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	@Scheduled(cron = "0 0/1 * * * ?")
	public void startTimer() {
		System.out.println("cron " + dateFormat.format(new Date()));
	}
	
	// 从上一次定时任务开始执行时计时，过2秒再次执行
	@Scheduled(fixedRate = 2000)
	public void TimerTask1() {
		System.out.println("task1 " + dateFormat.format(new Date()));
	}
	
	// 从上一次定时任务执行结束后计时，过2秒再次执行
	@Scheduled(fixedDelay = 2000)
	public void TimerTask2() {
		System.out.println("task2 " + dateFormat.format(new Date()));
	}
	
	// 从配置文件中获取
	@Scheduled(fixedDelayString = "${jobs.fixedDelay}")
	public void TimerTask3() {
		System.out.println("task3 " + dateFormat.format(new Date()));
	}
}
