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
		// new DVDDao().deleteDVD(new DVD(3,"�������M�ݡ�"));
	}

	public DVDListDao() {
		setdvd = new LinkedHashSet<>();
		setdvd.add(new DVD(1, "��������ա�", 1, null, "�ɽ�"));
		setdvd.add(new DVD(2, "���L���Q��", 1, null, "�ɽ�"));
		setdvd.add(new DVD(3, "�������M�ݡ�", 1, null, "�ɽ�"));
		BaseWrite();
	}

	private void BaseWrite() {
		for (DVD dvd : setdvd) {
			setFile = new File("F:/DVD����", dvd.getName());
			setFile.mkdirs();
		}
	}

	*//**
	 * ��ȡӲ��
	 * 
	 * @return
	 *//*
	public String[] ioRead() {
		return new File("F:/DVD����").list();
	}

	*//**
	 * ���DVDû����
	 * 
	 * @param e
	 *//*
	public void addDVD(DVD e) {
		if (isExist(e)) {
			// �黹ʱ����ļ�
			new File("F:/DVD����", e.getName()).mkdirs();

		} else {
			// ����Ա����ļ�
			setdvd.add(e);
			new File("F:/DVD����", e.getName()).mkdirs();
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
					// ����id��ɾ����������id�����Ʋ���ɾ��
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
		// ֻ��id��ɾ���б�Ҫid���ƶ��л�ɾ��Ӳ��
		for (DVD dvds : setdvd) {
			if (dvds.getId() == dvd.getId()) {
				if (dvds.getStatus().equals("�ɽ�")) {
					deleteDVD(dvd);
					dvds.setStatus("�ѽ��");
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