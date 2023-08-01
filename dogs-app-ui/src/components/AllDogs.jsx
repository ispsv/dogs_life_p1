import React, {useState, useEffect} from 'react'
import Row from 'react-bootstrap/Row'
import DogDetail from './DogDetail';
import { getAllDogs } from '../services/dogs-service';

const AllDogs = () => {
  const [dogs, setDogs] = useState([]);

  useEffect( () => {
    getDogsFromAPI();
  }, []);
  
  const getDogsFromAPI = ()=>{
    getAllDogs()
    .then(res => {
        console.log(res.data)
        setDogs(res.data);
    })
    .catch(err => {
        setDogs([]);
        console.log(err);
    })
  }

  return (
    <>
      <h1> Total count is: {dogs.length}</h1>
      <Row >
      {dogs.map(dog => (
        <div className='container' key={dog.id.toString()}>
          <DogDetail info={dog}/>
        </div>
       ))}
      </Row>
    </>
  )
}

export default AllDogs