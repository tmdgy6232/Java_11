package com.biz.exec.service;

public interface JavaService {

	
	/*
	 * 인터페이스의 생성
	 * 1. 기존에 이미 만들어진 JavaService 클래스를
	 * 		JavaServiceImp_01로 일단 복사해 둔다.
	 * 2. JaverService  파일에 있는 모든 매서드의 구현코드를 
	 * 		모두 삭제하고
	 * 3. 메서드의 원형(proto type)모양 만 남겨둔다.
	 * 모든 클래스의 몸체를 제거하고
	 * 4. class 키워드를 interface 키워드로 변경
	 * 5. javaserviceImp_01 클래스에서 implement 키워드를 사용하여
	 * 		javaservice 인터페이스를 연결한다.
	 * 
	 * 이후에 작성되는 javaservice와 같은 기능을 하며
	 * 성능이 업그레이드 되는 모든 클래스는
	 * javaservice를 임프리먼트 하도록한다.
	 */
	/*
	 * 클래스 생성
	 * 프로토 타입이라고도 한다
	 * proto type을 만든다
	 *   	= JavaService라는 이름으로 class 파일을 만든다
	 *   	= JavaService.java라는 파일을 만든다.
	 */
	public void call();

	public void call(int num);

	public void call(int num1, int num2);
	
	/*
	 * 프로그램(프로젝트, 애플리케이션)을 업그레이드 한다 라는 개념
	 * 1. 전혀 새로운 기능을 만들어서 누군가 사용하도록 하는것
	 * 2. 기존에 이미 만들어져 있는 기능을 성능등을 개선해서
	 * 기존에 이미 사용하던 사람에게 다시 제공하는 것
	 */
}
