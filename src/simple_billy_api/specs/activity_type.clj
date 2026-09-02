(ns simple-billy-api.specs.activity-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def activity-type-data
  {
   })

(def activity-type-spec
  (ds/spec
    {:name ::activity-type
     :spec activity-type-data}))
