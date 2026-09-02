(ns simple-billy-api.specs.movement-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def movement-type-data
  {
   })

(def movement-type-spec
  (ds/spec
    {:name ::movement-type
     :spec movement-type-data}))
