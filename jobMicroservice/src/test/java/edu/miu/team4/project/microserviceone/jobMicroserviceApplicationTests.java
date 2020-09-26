package edu.miu.team4.project.microserviceone;

import edu.miu.team4.project.microserviceone.domain.CptReport;
import edu.miu.team4.project.microserviceone.domain.Job;
import edu.miu.team4.project.microserviceone.domain.JobSearchReport;
import edu.miu.team4.project.microserviceone.repository.CptReportRepository;
import edu.miu.team4.project.microserviceone.repository.JobRepository;
import edu.miu.team4.project.microserviceone.repository.JobSearchReportRepository;
import edu.miu.team4.project.microserviceone.service.CptReportService;
import edu.miu.team4.project.microserviceone.service.JobSearchReportService;
import edu.miu.team4.project.microserviceone.service.JobService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
class jobMicroserviceApplicationTests {
    @Autowired
    private CptReportService cptReportService;

    @MockBean
    private CptReportRepository cptReportRepository;

    @Autowired
    private JobService jobService;
    @MockBean
    private JobRepository jobRepository;

    @Autowired
    private JobSearchReportService jobSearchReportService;
    @MockBean
    private JobSearchReportRepository jobSearchReportRepository;


    @Test
    public void getCptReportsTest() {
        when(cptReportRepository.findAll())
                .thenReturn(
                        java.util.stream.Stream
                                .of(new CptReport(1, new Date(), "hopefully thr last test", new Job(11), 3),
                                        new CptReport(2, new Date(), "hopefully thr last test", new Job(11), 3))
                                .collect(Collectors.toList()));
        assertEquals(2, 0);
    }

    @Test
    public void getJobSearchReportTest() {
        when(jobSearchReportRepository.findAll())
                .thenReturn(
                        java.util.stream.Stream
                                .of(new JobSearchReport(1, new Date(), 12,"reporttes"),
                                        new JobSearchReport(2,new Date(), 12,"reporttes" ))
                                .collect(Collectors.toList()));
        assertEquals(2, jobSearchReportService.getAllJobSearchReport().size());
    }
    @Test
    public void getJobTest() {
        when(jobRepository.findAll())
                .thenReturn(
                        java.util.stream.Stream
                                .of(new Job(1, "hopefully thr last test","200", new Date(), new ArrayList<CptReport>(Arrays.asList(new CptReport()))),
                                        new Job(2, "hopefully thr last test","500", new Date(), new ArrayList<CptReport>(Arrays.asList(new CptReport()))))
                                .collect(Collectors.toList()));
        assertEquals(2, jobService.getAllJob().size());
    }

    @Test
    void contextLoads() {
    }

}
