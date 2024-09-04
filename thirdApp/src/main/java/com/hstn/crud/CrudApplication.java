package com.hstn.crud;

import com.hstn.crud.dao.PupilDAO;
import com.hstn.crud.dao.PupilDAOImpl;
import com.hstn.crud.entity.Pupil;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.sound.midi.Soundbank;
import java.util.List;

@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(PupilDAO pupilDAO) {
//		2nd variant: use class not interface
//	public CommandLineRunner commandLineRunner(PupilDAOImpl pupilDAOImpl) {
		return runner -> {
			createPupil(pupilDAO);
//			readPupilInfo(pupilDAO);
//			getAllPupils(pupilDAO);
//			getPupilByLastName(pupilDAO);
//			updatePupil(pupilDAO);
//			deletePupilById(pupilDAO);
//			deleteAll(pupilDAO);
		};
	}

	private void deleteAll(PupilDAO pupilDAO) {
		System.out.println("Delete all pupils...");
		int quantityDeletedPupils = pupilDAO.deleteAllPupils();
		System.out.println("Quantity deleted pupils: " + quantityDeletedPupils);
	}

	private void deletePupilById(PupilDAO pupilDAO) {
		int idForDeletePupil = 2;
		System.out.println("Delete pupil with id = " + idForDeletePupil);
		pupilDAO.delete(idForDeletePupil);
	}

	private void updatePupil(PupilDAO pupilDAO) {
		System.out.println("Getting pupil from DB...");
		Pupil pupil = pupilDAO.findById(4);

		System.out.println("Pupil before Update:" + pupil);

		System.out.println("Update pupil...");
		pupil.setLastName("Antonov");
		pupil.setEmail("DimAnt@yandex.ru");

		pupilDAO.update(pupil);
		System.out.println("Pupil after update:" + pupil);
	}

	private void getPupilByLastName(PupilDAO pupilDAO) {
		System.out.println("List of all pupils...");
		List<Pupil> pupils = pupilDAO.findPupilByLastName("Petrov");
		if (pupils.size() == 0) {
			System.out.println("There are none");
		} else {
			for (Pupil p : pupils) {
				System.out.println(p);
			}
		}
	}

	private void getAllPupils(PupilDAO pupilDAO) {
		System.out.println("List of all pupils...");
		List<Pupil> pupils = pupilDAO.findAll();
		for (Pupil p : pupils) {
			System.out.println(p);
		}
	}

	private void readPupilInfo(PupilDAO pupilDAO) {
		System.out.println("Read pupil info...");
		Pupil pupil = pupilDAO.findById(3);
		System.out.println("Pupil info from DB: \n\t" + pupil);
	}

	private void createPupil(PupilDAO pupilDAO) {
		System.out.println("Creating new pupil...");
		Pupil pupil = new Pupil("Test_1", "Test_2", "Test_3@gmail.ru");
		System.out.println("Save pupil in DB...");
		pupilDAO.save(pupil);
		System.out.println("Pupil in DB: \n\t" + pupil);
	}

}
