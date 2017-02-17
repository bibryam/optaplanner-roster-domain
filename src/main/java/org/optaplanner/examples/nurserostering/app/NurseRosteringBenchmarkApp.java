/*
 * Copyright 2010 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.optaplanner.examples.nurserostering.app;

public class NurseRosteringBenchmarkApp extends CommonBenchmarkApp {

    public static void main(String[] args) {
        new NurseRosteringBenchmarkApp().buildAndBenchmark(args);
    }

    public NurseRosteringBenchmarkApp() {
        super(
//                new ArgOption("sprint",
//                        "org/optaplanner/examples/nurserostering/benchmark/nurseRosteringSprintBenchmarkConfig.xml"),
//                new ArgOption("medium",
//                        "org/optaplanner/examples/nurserostering/benchmark/nurseRosteringMediumBenchmarkConfig.xml"),
//                new ArgOption("long",
//                        "org/optaplanner/examples/nurserostering/benchmark/nurseRosteringLongBenchmarkConfig.xml"),
//                new ArgOption("stepLimit",
//                        "org/optaplanner/examples/nurserostering/benchmark/nurseRosteringStepLimitBenchmarkConfig.xml"),
                new ArgOption("stepLimit",  "org/optaplanner/examples/app/benchmark/generalOptaPlannerBenchmarkConfig.xml")
        );
    }

}
