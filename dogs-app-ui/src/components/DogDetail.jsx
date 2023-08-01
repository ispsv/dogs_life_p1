import { React, useState } from 'react';
import images from '../index';
import Row from 'react-bootstrap/esm/Row';
import Col from 'react-bootstrap/Col';
import Button from 'react-bootstrap/Button';
import Card from 'react-bootstrap/Card';

const DogDetail = (props) => {
//   const[counter, setCounter] = useState(0);

//   const incrementCounter = () => {
//     setCounter(counter+1);
//     props.parentCount(props.info.alias);
//   }

  return (
    <Card >
      <Card.Body >
        <Card.Title> Name: {props.info.name}</Card.Title>
        <Card.Text> Age: {props.info.age}</Card.Text>
        {/* <Row>
          <Col><Button variant="primary" onClick={incrementCounter}>Like</Button></Col>
          <Col>{ counter > 0  && <Card.Text >Likes: {counter}</Card.Text > }</Col>
        </Row> */}
      </Card.Body>
    </Card>
  )
}

export default DogDetail