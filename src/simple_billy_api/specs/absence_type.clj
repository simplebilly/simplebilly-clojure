(ns simple-billy-api.specs.absence-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def absence-type-data
  {
   })

(def absence-type-spec
  (ds/spec
    {:name ::absence-type
     :spec absence-type-data}))
