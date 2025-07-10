
---

# VoidGenPlus

**VoidGenPlus** is a lightweight Minecraft plugin for Paper 1.21.7 that generates a void world with a single bedrock block at the spawn point. It's ideal for creating lobbies, creative worlds, or skyblock maps.

## 🛠️ Features

* Generates an empty world with only one bedrock block at coordinates (0, 0).
* Compatible with Paper 1.21.7.
* Simple configuration via `bukkit.yml`.([Modrinth][1])

## 📦 Installation

1. Download the latest `VoidGenPlus.jar` file.
2. Place the `.jar` file into your server's `plugins/` directory.
3. Restart the server to load the plugin.

## ⚙️ Configuration

To use VoidGenPlus as the world generator, modify your `bukkit.yml` file located in the root directory of your server:([GitHub][2])

```yaml
worlds:
  your_world_name:
    generator: VoidGenPlus
```



Replace `your_world_name` with the desired name of your world.([Modrinth][1])

## 🧪 Usage

After configuring `bukkit.yml`, start your server. When the specified world is generated, it will be an empty void with a single bedrock block at the spawn location.([Modrinth][1])

## 🧰 Requirements

* Paper server version 1.21.7
* Java 21

## 📄 License

This project is licensed under the MIT License.

---