import React from 'react';
import { View, Text, TextInput, StyleSheet, Pressable, Image } from 'react-native';
import { SafeAreaView, useSafeAreaInsets } from 'react-native-safe-area-context';
import { StatusBar } from 'react-native';

export default function MainScreen() {
    const insets = useSafeAreaInsets();

    return (
        <SafeAreaView style={styles.container} edges={['left', 'right', 'bottom']}>
            <StatusBar hidden={false} barStyle="light-content" translucent backgroundColor="transparent" />
            <View style={[styles.statusBarBackground, { height: insets.top }]} />

            <View style={styles.topBar}>
                <Text style={styles.topBarText}>Example 1: React Native</Text>
            </View>

            <View style={styles.imageContainer}>
                <Image 
                    source={require('./assets/images/img.png')}
                    style={{ width: 100, height: 100}}/>
            </View>
            

            <View style={styles.buttonRow}>
                <Pressable android_ripple={{ color: "#999" }} style={styles.button} onPress={() => {}}>
                    <Text>BUTTON</Text>
                </Pressable>
                <Pressable android_ripple={{ color: "#999" }} style={styles.button} onPress={() => {}}>
                    <Text>BUTTON</Text>
                </Pressable>
            </View>

            <View style={styles.buttonRow}>
                <Pressable android_ripple={{ color: "#999" }} style={styles.button} onPress={() => {}}>
                    <Text>BUTTON</Text>
                </Pressable>
                <Pressable android_ripple={{ color: "#999" }} style={styles.button} onPress={() => {}}>
                    <Text>BUTTON</Text>
                </Pressable>
            </View>

            <View style={styles.emailContainer}>
                <Text style={styles.emailLabel}>Email</Text>
                <TextInput style={styles.emailInput} cursorColor="#d60068"/>
            </View>

            


        </SafeAreaView>
    );
    }

const styles = StyleSheet.create({
    container: { flex: 1, justifyContent: 'flex-start' },
    statusBarBackground: { backgroundColor: '#375e57' },
    input: { borderWidth: 1, padding: 10, marginBottom: 20 },
    topBar: { 
        height: 50, 
        backgroundColor: '#518a80', 
        padding: 0, 
        justifyContent: 'center' 
    },
    topBarText: { 
        color: 'white', 
        fontSize: 20, 
        textAlign: 'left', 
        alignContent: 'center',
        paddingLeft: 10,

    },
    imageContainer: {
        justifyContent: "center", 
        alignItems: "center", 
        marginTop: 10, 
        marginBottom: 30,
    },
    buttonRow: {
        flexDirection: 'row',
        justifyContent: 'space-around',
        marginBottom: 30
    },
    button: {
        backgroundColor: "#bbb",
        padding: 10,
    },
    emailContainer: {
        flexDirection: 'row', 
        alignItems: 'center',
    },
    emailLabel: {
        fontSize: 16,
        color: "grey",
        marginLeft: 20,
        marginRight: 50,
    },
    emailInput: {
        borderWidth: 0,
        borderBottomWidth: 2,
        borderColor: "#d60068",
        width: '50%',
        padding: 0,
        margin: 0,
    }
});