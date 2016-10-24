package com.nst.eng.rest;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


public class HelloControllerTest {

    private HelloController subject;
    private MockMvc mockMvc;

    @Before
    public void setUp(){
        subject = new HelloController();
        mockMvc = MockMvcBuilders.standaloneSetup(subject).build();
    }

    @Test
    public void hello_displaysHelloName() throws Exception {
        MvcResult mvcResult = mockMvc.perform(get("/api/public/hello/srini"))
                .andExpect(status().isOk())
                .andReturn();
        String contentAsString = mvcResult.getResponse().getContentAsString();
        assertThat(contentAsString).contains("Hello srini");
    }

    @Test
    public void currentTime_displaysCurrentDate() throws Exception {
        MvcResult mvcResult = mockMvc.perform(get("/api/hello/currentTime"))
                .andExpect(status().isOk())
                .andReturn();
        String contentAsString = mvcResult.getResponse().getContentAsString();
        assertThat(contentAsString).contains("Hello Current Time : ");
    }

}
