# kheera-android-studio-plugin

1. Generate IDEA SDK (for plugin development purpose) by referencing following tutorial:
http://www.jetbrains.org/intellij/sdk/docs/basics/checkout_and_build_community.html

2. Set up Intellij Plugin development environment by referencing following tutorial:
http://www.jetbrains.org/intellij/sdk/docs/basics/getting_started/setting_up_environment.html

3. Check out Intellij plugin repository.

4. Download latest IntelliJ IDEA CE. Don't use IntelliJ IDEA 14.

5. Open Kheera and also import intellij-plugins/cucumber as dependency module (also known as Gherkin) for Kheera.
   Note Gherkin should be "provided" module instead of "compile".

Note:
-----
1. Check Android Studio JRE version in your team and make sure it's 1.8.

2. Plugin debug can be done by choosing and running Kheera debug configuration.