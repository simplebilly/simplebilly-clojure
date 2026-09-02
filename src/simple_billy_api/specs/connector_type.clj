(ns simple-billy-api.specs.connector-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def connector-type-data
  {
   })

(def connector-type-spec
  (ds/spec
    {:name ::connector-type
     :spec connector-type-data}))
