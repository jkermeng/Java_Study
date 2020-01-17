package mapdemo;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Test {
	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put("1", "one");
		hashMap.put("2", "two");
		hashMap.put(null, "three");
		hashMap.put("4", null);

		System.out.println("-------��һ�ֲ�ѯ------------");
		Set<String> keySet = hashMap.keySet();

		for (String keys : keySet) {
			System.out.println(hashMap.get(keys));
		}
		System.out.println("-----------�ڶ��ֲ�ѯ--------------");
		Set<Entry<String, String>> entrySet = hashMap.entrySet();
		for (Entry<String, String> entry : entrySet) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + "=" + value);
		}
		System.out.println("-------------------------------");
		// ����洢����
		HashMap<Person, String> hashMap2 = new HashMap<>();
		hashMap2.put(new Person("����", 22), "����1");
		hashMap2.put(new Person("����", 25), "����2");
		hashMap2.put(new Person("����", 22), "����3");
		hashMap2.put(new Person("����", 22), "����4");

		Set<Entry<Person, String>> entrySet2 = hashMap2.entrySet();
		for (Entry<Person, String> entry : entrySet2) {
			Person key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key.getName() + "=" + value);
		}
		HashMap<Object, Object> hashMap3 = new HashMap<>();
		hashMap3.put(new Person(), 1);
		TreeMap<Object, Object> treeMap = new TreeMap<>();
		// treeMap.put(new Person("xxx",2), "1");//treeMap
		// ��key���ܷ�û��ʵ��compare�ӿڵ���������
		// treeMap��keyһ��Ҫʵ��compareble�ӿ�
		LinkedHashMap<Person, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put(new Person("xxx", 2), "1");
		// args.equals();��hashcode����ͬ��ȴ��
		Map<String, String> map = new TreeMap<>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return -o1.length() + o2.length();
			}
		});
		map.put("����ƽͷ��", "�����");
		map.put("�Դ�BGM������", "�Ƿ�");
		map.put("�忪��", "�Ħ��");
		map.put("����ʤ�����ù�", "���");
		System.out.println(map);
		
	}
}

class Person {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Person() {
		super();
	}

	@Override
	public boolean equals(Object obj) {

		return true;
	}

	@Override
	public int hashCode() {
		int result = 1;
		int pare = 31;
		result = pare * result + this.age;
		result = pare * result + (this.name == null ? 0 : this.name.hashCode());
		return result;
	}

}