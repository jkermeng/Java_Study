package dao;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import entity.DVD;

public class DVDDao {
	private File file;
	private DVD[] dvdList;

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		boolean sameDVD = new DVDDao().isSameDVD(new DVD(1, "罗马假日"));
		System.out.println(sameDVD);
	}

	public DVDDao() throws IOException, ClassNotFoundException {
		file = new File("F:/DVD管理/");

		if (!file.exists()) {
			file.mkdirs();
			if (file.list().length == 0) {
				DVD[] dvd = { new DVD(1, "《罗马假日》", 1, null, "可借"), new DVD(2, "《夏日狂欢》", 1, null, "可借"),
						new DVD(3, "《僵尸新娘》", 1, null, "可借") };
				System.out.println("movebitch");
				for (DVD dvd2 : dvd) {
					addDist(dvd2);
				}
			}

		}
		dvdList = new DVD[file.listFiles().length];
		dvdList = selectDistDVD();

	}

	public void addDist(DVD dvd) throws IOException, IOException {
		// if (!isSameDVD(dvd)) {
		ObjectOutputStream oops = new ObjectOutputStream(new BufferedOutputStream(
				new FileOutputStream(new File(file, dvd.getName().substring(1, dvd.getName().length() - 1) + ".obj"))));
		oops.writeObject(dvd);
		oops.close();
		// }

	}

	public DVD[] selectDistDVD() throws IOException, ClassNotFoundException {
		File[] listFiles = file.listFiles();
		int len = 0;
		DVD dvds[] = new DVD[file.list().length];
		for (File file : listFiles) {
			ObjectInputStream oips = new ObjectInputStream(new FileInputStream(file));
			dvds[len] = (DVD) oips.readObject();
			len++;
			oips.close();
		}
		return dvds;
	}

	public void deleteDistDVD(DVD dvd) throws IOException, ClassNotFoundException, IOException {
		DVD[] selectDistDVD = selectDistDVD();
		File[] listFiles = file.listFiles();
		int k = 0;
		for (DVD dvds : selectDistDVD) {
			if (dvds.getId() == dvd.getId()) {
				listFiles[k].delete();
			}
			k++;
		}
	}

	public boolean isSameDVD(DVD dvd) {
		if (new File(file, dvd.getName() + ".obj").exists()) {
			return true;
		}
		return false;
	}

}
