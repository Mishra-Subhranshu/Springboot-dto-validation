package com.example.dtodemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

public class ErrorDetails {


        private String details;

        private String describeError;


        public ErrorDetails() {
        }

        public ErrorDetails(String details, String describeError) {
                this.details = details;
                this.describeError=describeError;
        }

        public String getDetails() {
                return details;
        }

        public void setDetails(String details) {
                this.details = details;
        }

        public String getDescribeError() {
                return describeError;
        }

        public void setDescribeError(String describeError) {
                this.describeError = describeError;
        }
}

