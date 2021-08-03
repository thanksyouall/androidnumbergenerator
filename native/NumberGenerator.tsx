import React from 'react'
import { requireNativeComponent, ViewProps } from 'react-native'

const NativeNumberGenerator = requireNativeComponent('NumberGenerator')

interface Props extends ViewProps {

}
const NumberGenerator = (props: Props) => {
    return <NativeNumberGenerator {...props} />
}
export default NumberGenerator