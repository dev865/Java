package etc;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackAndQueue {
	public static void main(String[] args) {
		
		// stack 구조 : 책을 바닥부터 쌓는 모양으로 데이터가 만들어지는 형태
		// 후입선출 - Last Input First Out : 마지막에 쌓인 데이터를 가장 먼저 꺼낼 수 있다
		// queue 구조 : 양쪽이 열려있는 파이프를 한 쪽에서 데이터를 밀어 넣는 형태
		// 선입선출 - First In First Out : 처음 쌓은 데이터부터 먼저 꺼낼 수 있다
		
		Stack<Integer> stack = new Stack<>();
		Queue<Integer> que = new LinkedList<>(); 
		
		stack.push(11111);
		stack.push(22222);
		stack.push(33333);
		stack.push(44444);
		stack.push(55555);
		stack.push(66666);
		stack.push(77777);
		stack.push(88888);
		stack.push(99999);
		System.out.println("Stack 구조");
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}
		
		que.offer(11111);
		que.offer(22222);
		que.offer(33333);
		que.offer(44444);
		que.offer(55555);
		System.out.println("Queue 구조");
		while(!que.isEmpty()) {
			System.out.println(que.poll());
		}
		
	}
}