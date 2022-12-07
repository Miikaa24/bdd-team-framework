#!/bin/sh
mvn verify -D cucumber.filter.tags="@employment" -D browser=chromeHeadless
mvn verify -D cucumber.filter.tags="@employment" -D browser=firefoxHeadless
mvn verify -D cucumber.filter.tags="@employment" -D browser=safari

