package DataStructure_YouTubeTest.linkedlist;

public class SingleLinkedListDemo {

	public static void main(String[] args) {
		//進行測試
		//先創建節點
		HeroNode hero1 = new HeroNode(1, "宋江", "及時雨");
		HeroNode hero2 = new HeroNode(2, "盧俊義", "王麒麟");
		HeroNode hero3 = new HeroNode(3, "吳用", "智多星");
		HeroNode hero4 = new HeroNode(4, "林沖", "豹子頭");
		
		//創建要給鏈表
		SingleLinkedList singleLinkedList = new SingleLinkedList();
		//加入
		singleLinkedList.add(hero1);
		singleLinkedList.add(hero4);
		singleLinkedList.add(hero2);
		singleLinkedList.add(hero3);
		//顯示
		singleLinkedList.list();
	}

}


//定義 SingleLinkedList 管理我們的英雄
class SingleLinkedList {
	//先初始化一個頭節點, 頭節點不要動, 不存放具體的數據
	private HeroNode head = new HeroNode(0, "", "");
	
	//添加節點到單向鏈表
	//思路, 當不考慮編號順序時
	//1. 找到當前鏈表的最後方法
	//2. 將最後這個節點的next 指向 新的節點
	public void add(HeroNode heroNode) {
		
		 // 因為head節點不能動, 因此我們需要一個輔助遍歷 temp
		HeroNode temp = head;
		//遍歷最後, 找到最後
		while(true) {
			//找到鏈表的最後
			if (temp.next == null) {
				break;
			}
			// 如果沒有找到最後, 則將temp後移
			temp = temp.next;   
		}
		//當退出while循環時, temp就指向了鏈表的最後
		//將最後這個節點的next 指向 新的節點
		temp.next = heroNode;
	}
	//顯示鏈表(遍歷)
	public void list() {
		//鏈表是否為空
		if(head.next == null) {
			System.out.println("鏈表為空");
			return;
		}
		//因為頭節點, 不能動, 因此我們需要一個輔助變量來遍歷
		HeroNode temp = head.next;
		while (true) {
			//判斷是否到鏈表最後
			if(temp == null) {
				break;
			}
			//輸出節點的信息
			System.out.println(temp);
			//將next後移, 一定小心
			temp = temp.next;
		}
	}
}

//定義 HeroNode, 每一個HeroNode 對象就是一個節點
class HeroNode {
	public int no;
	public String name;
	public String nickname;
	public HeroNode next; //指向下一個節點
	// 構造器
	public HeroNode(int no, String name, String nickname) {
		this.no = no;
		this.name = name;
		this.nickname = nickname;
	}
	//為了顯示方法, 我們重新定義toString
	@Override
	public String toString() {
		return "HeroNode [no=" + no + ", name=" + name + ", nickname=" + nickname+"]";
	}
	
}
