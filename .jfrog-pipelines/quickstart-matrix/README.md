# Overview

**Matrix Single Dimension**: [![Matrix](https://pipelines.jfrog.io/pipelines/api/v1/badges/project/quickstarts/pipelines/matrix_single_dimension_pipeline?text=JFrogPipelines)](https://pipelines.jfrog.io/ui/pipelines/myPipelines/Quickstarts/matrix_single_dimension_pipeline?projectKey=quickstarts)

**Matrix Two Dimension**: [![Matrix](https://pipelines.jfrog.io/pipelines/api/v1/badges/project/quickstarts/pipelines/matrix_two_dimension_pipeline?text=JFrogPipelines)](https://pipelines.jfrog.io/ui/pipelines/myPipelines/Quickstarts/matrix_two_dimension_pipeline?projectKey=quickstarts)

This sample shows you how to create simple matrix steps which can help you run tests in parallel or test against multiple versions of a language.

The Matrix step commences multiple parallel build processes across multiple containers, with different settings for each.

Common use cases for Matrix steps are:

- Splitting a large test suite into smaller units, and executing them in parallel to reduce total execution time.

- Testing against multiple values of environment variables or multiple runtime images.

- Testing against multiple base operating system versions.

The Matrix step executes the specified shell scripts multiple times in parallel steplets, in each specified runtime for each set of environment variables on each specified platform. For example, if a Matrix step specifies 3 sets of environment variables and 2 runtime images, it will run a total of 6 steplets (3 times in runtime 1, 3 times in runtime 2). If the Matrix step also specifies 2 node pools, it will run 12 steplets.

Detailed instructions on how to run this sample, as well as explanation of the configuration, is in the JFrog Pipelines documentation: [Using the Matrix Step](https://www.jfrog.com/confluence/display/JFROG/Using+the+Matrix+Step).

## Live Example 
Click [here](https://pipelines.jfrog.io/ui/pipelines/myPipelines/Quickstarts/matrix_single_dimension_pipeline?projectKey=quickstarts) and [here](https://pipelines.jfrog.io/ui/pipelines/myPipelines/Quickstarts/matrix_single_dimension_pipeline?projectKey=quickstarts) to see Matrix steps in action.
