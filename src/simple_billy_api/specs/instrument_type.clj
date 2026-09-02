(ns simple-billy-api.specs.instrument-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def instrument-type-data
  {
   })

(def instrument-type-spec
  (ds/spec
    {:name ::instrument-type
     :spec instrument-type-data}))
