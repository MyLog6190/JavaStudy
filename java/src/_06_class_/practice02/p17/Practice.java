package _06_class_.practice02.p17;

public class Practice {}

class Unit {
	int x, y;
	void move(int x, int y) { /* 지정된 위치로 이동 */ }
	void stop(){ /* 현재 위치에 정지 */ }
}

class Marine extends Unit{
	void stimPack(){ /* 스팀팩을 사용한다 .*/}
}

class Tank extends Unit{
	void stop()
	{ /* 현재 위치에 정지 */ }
	void changeMode()
	{ /* 공격모드를 변환한다 . */}
}
	
class Dropship extends Unit{ // 수송선
	void stop(){}
	void load(){}
	void unload(){}
}