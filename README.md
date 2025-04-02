# Meal Suggestion App

A simple Android application built using Kotlin to suggest meals based on the time of day. The app takes user input for the time of day (e.g., "morning", "mid-afternoon", "dinner") and displays meal suggestions.

## Features

- **Meal Suggestions:** Based on the time entered by the user, meal suggestions are displayed (e.g., "Toast with egg" for morning, "Chicken and rice" for dinner, etc.).
- **Reset Functionality:** The app allows the user to reset the input field and shows a reset message.
- **Edge-to-Edge Design:** The app is designed to support edge-to-edge displays for modern Android devices.
  
## Screenshots

(Include screenshots of the app here if needed.)

## Installation

### Prerequisites

Ensure you have the following software installed:

- [Android Studio](https://developer.android.com/studio) (latest version recommended)
- Android SDK

### Steps to Run the App

1. Clone this repository or download the project.
2. Open the project in Android Studio.
3. Run the app on an emulator or physical device.

## Usage

1. **Enter Time:** Input a time of day such as "morning", "mid-afternoon", or "dinner" in the provided text field.
2. **Submit:** Press the **Submit** button to get meal suggestions based on the time entered.
3. **Reset:** Press the **Reset** button to clear the text field and reset the app to its initial state.

## Code Explanation

The core functionality of the app is as follows:

- **Meal Suggestions Logic:** 
    - The app uses an `EditText` to input the time of day.
    - When the **Submit** button is clicked, the time entered is matched to meal suggestions.
    - The `TextView` is updated with the meal suggestion based on the entered time.
  
- **Edge-to-Edge Support:**
    - The app enables edge-to-edge support for devices with modern screens by using `ViewCompat.setOnApplyWindowInsetsListener`.

- **Logging:** 
    - The app uses the Android `Log` class for debugging purposes. Log messages help track button clicks and meal suggestions.

## Example Meal Suggestions

- **Morning:** "Toast with egg, avocado and cranberries!! or Oatmeal with banana and peanut butter!!"
- **Mid-Afternoon:** "Fruit salad!! or Apple and bananas!!"
- **Dinner:** "Lamb shank with rice and vegetables!! or Chicken and rice with vegetables!!"

## Contributing

Feel free to fork the repository, open issues, and submit pull requests if you'd like to contribute improvements or bug fixes.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.



