#!/bin/sh
mvn verify -D cucumber.filter.tags="@tests" -D browser=chrome
mvn verify -D cucumber.filter.tags="@tests" -D browser=firefox
mvn verify -D cucumber.filter.tags="@tests" -D browser=safari

