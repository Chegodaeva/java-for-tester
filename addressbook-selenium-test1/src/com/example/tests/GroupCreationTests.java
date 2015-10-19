package com.example.tests;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase{
  @Test
  public void testNonEmptyGroupCreation() throws Exception {
	openMainPage();
	gotoGroupsPage();
	initGroupCreation();
	GroupData group = new GroupData();
	group.name = "groupname 1";
	group.header = "header 1";
	group.footer = "foooter 1";
	fillGroupForm(group);
	submitGroupCreation();
	returnToGroupsPage();
  }
  @Test
  public void testEmptyGroupCreation() throws Exception {
		openMainPage();
		gotoGroupsPage();
		initGroupCreation();
		fillGroupForm(new GroupData("", "", ""));
		submitGroupCreation();
		returnToGroupsPage();
	  }
}
