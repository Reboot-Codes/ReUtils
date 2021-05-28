# ReUtils

![Build Status](https://img.shields.io/circleci/build/github/Reboot-Codes/ReUtils/main) ![Last Commit](https://img.shields.io/github/last-commit/Reboot-Codes/ReUtils)

A general utility plugin for Minecraft servers.

> Uses the Spigot API because it's the first thing that worked, might switch to the Paper API if it works with the existing build.

Supports **1.16.5**; however if you would like to use earlier versions you might be able to, but support isn't guaranteed. **1.17** support is planned, and will be updated if need be! Future version support is also planned. 😄

This plugin is packaged to contain these modules:

> Checks and crosses mark if a module is implemented in the current build or not (respectively). A mark does not indicate if the module is done or not however.

- ✔ ExperienceUtils - A module to do basic things to make a player's experience better on your server (Homes, PlayerSkulls, DecorSkulls, etc)
- ❌ FarmingUtils - A module to allow for easier public farms (MultiSummon, etc)
- ❌ CommunityUtils - A module for managing player to player interactions (Friends, Public Warps, Mail, etc)
- ❌ ShopUtils - A module for sign shops that integrate into a vault compatible economy plugin, dissabled if an economy plugin, or vault is not present at enable.

~~Modules can be configured in the `config.yml` in the `plugins/ReUtils` directory in the root of your server.~~ Not Ready _Yet_.

This plugin has a _soft dependancy_ on [Vault](https://github.com/milkbowl/Vault) for extra features such as: a permisions manager integration, and shops. Go ahead and add that as a plugin too if you would like those integrations.

## Build it yourself

You'll need the JDK & JRE 16 (Future-proofing for 1.17.X and onwards), Git, and a testing server (Using [Paper](https://github.com/PaperMC/Paper) or [Tuinity](https://github.com/Tuinity/Tuinity) is suggested).

1. Clone this repo with: `git clone https://github.com/Reboot-Codes/ReUtils`
2. Go into the ReUtils directory with: `cd ReUtils`
3. Run the `jar` Gradle task: `./gradlew jar` (Unix) or `.\gradlew.bat jar` (Windows)

Now you can get the `ReUtils-X.X.X.jar` file out of the `build/libs` directory to put into your Server's `plugins` directory!

## List of Commands

- **/ruversion**

    Lists the version of the plugin.
  
- **/playerskull**
  
  When run without args, returns the player's head.
  Or the first argument sets the skull's owner.
