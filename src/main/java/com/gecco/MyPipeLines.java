package com.gecco;

import java.util.List;

import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;

@PipelineName("myPipeLines")
public class MyPipeLines implements Pipeline<TrainingAgencyModel>{

	public void process(TrainingAgencyModel trainingAgencyModel) {
		try {
		List<TrainingAgencyItems> items = trainingAgencyModel.getItems();
		for (TrainingAgencyItems trainingAgencyItems : items) {
			List<TrainingAgency> trainingAgencys = trainingAgencyItems.getTrainingAgencys();
			for (TrainingAgency trainingAgency : trainingAgencys) {
				System.out.println(trainingAgency.toString());
			}
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
