load("@rules_java//java:defs.bzl", "java_binary", "java_library")

package(default_visibility = ["//visibility:public"])

java_library(
    name = "java-maven-lib",
    srcs = glob(["src/main/java/com/bakuyuu/**/*.java"]),
    deps = ["@maven//:com_google_inject_guice"],
)

java_binary(
    name = "java-maven",
    main_class = "com.bakuyuu.Communication",
    runtime_deps = [":java-maven-lib"],
)