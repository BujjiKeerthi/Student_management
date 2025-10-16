package com.course.jdbc.dto;

public class Course {
	private int courseId;
	private String courseName;
	private String courseInfo;
	private int Month;
	private float fees;
	
	
	
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseInfo() {
		return courseInfo;
	}
	public void setCourseInfo(String courseInfo) {
		this.courseInfo = courseInfo;
	}
	public int getMonth() {
		return Month;
	}
	public void setMonth(int month) {
		Month = month;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "courseId=" + courseId + ", courseName=" + courseName + ", courseInfo=" + courseInfo + ", Month="
				+ Month + ", fees=" + fees + "";
	}
	
}
