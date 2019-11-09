/*package dao;

import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import entity.DVD;

public class DVDListDao {
	private static Set<DVD> setdvd;
	private static File setFile;
	public static void main(String[] args) {
		// new DVDDao().deleteDVD(new DVD(3,"《爛漫滿屋》"));
	}

	public DVDListDao() {
		setdvd = new LinkedHashSet<>();
		setdvd.add(new DVD(1, "《罗马假日》", 1, null, "可借"));
		setdvd.add(new DVD(2, "《風生鶴起》", 1, null, "可借"));
		setdvd.add(new DVD(3, "《爛漫滿屋》", 1, null, "可借"));
		BaseWrite();
	}

	private void BaseWrite() {
		for (DVD dvd : setdvd) {
			setFile = new File("F:/DVD管理", dvd.getName());
			setFile.mkdirs();
		}
	}

	*//**
	 * 读取硬盘
	 * 
	 * @return
	 *//*
	public String[] ioRead() {
		return new File("F:/DVD管理").list();
	}

	*//**
	 * 添加DVD没问题
	 * 
	 * @param e
	 *//*
	public void addDVD(DVD e) {
		if (isExist(e)) {
			// 归还时添加文件
			new File("F:/DVD管理", e.getName()).mkdirs();

		} else {
			// 管理员添加文件
			setdvd.add(e);
			new File("F:/DVD管理", e.getName()).mkdirs();
		}
	}

	public Set<DVD> selectDVD() {
		return setdvd;
	}

	public void deleteDVDList(DVD dvd) {
		for (String dvds : ioRead()) {

		}

	}

	public void deleteDVD(DVD dvd) {
		Iterator<DVD> iterator = setdvd.iterator();
		for (int i = 0; i < setdvd.size(); i++) {
			DVD next = iterator.next();
			String ioRead = ioRead()[i];
			if (ioRead.length() < i) {

			}
			if (next.getId() == dvd.getId()) {
				if (dvd.getId() != null && dvd.getName() != null) {
					// 输入id会删掉表单，输入id和名称不会删除
					setdvd.remove(next);
					setFile.delete();

				} else {
					for (String string : ioRead()) {
						if (dvd.getName().equals(string)) {
							setFile.delete();
						}
					}

				}
			}

		}
	}

	public Set<DVD> selectDVDById(DVD dvd) {
		Set<DVD> templory = new LinkedHashSet<>();
		for (DVD dvds : setdvd) {
			if (dvd == null) {
				return null;
			} else if (dvds.getId() == dvd.getId()) {
				templory.add(dvds);
				return templory;
			}

		}
		return null;
	}

	public void borrowDVD(DVD dvd) {
		for (DVD dvds : setdvd) {
			if (dvds.getId() == dvd.getId()) {
				addDVD(dvds);
			}
		}
	}

	public void lendDVD(DVD dvd) {
		// 只有id会删掉列表，要id名称都有会删掉硬盘
		for (DVD dvds : setdvd) {
			if (dvds.getId() == dvd.getId()) {
				if (dvds.getStatus().equals("可借")) {
					deleteDVD(dvd);
					dvds.setStatus("已借出");
				}
			}
		}
	}

	public boolean isExist(DVD dvd) {
		if (selectDVDById(dvd) == null) {
			return false;
		}
		return true;
	}
}
*/