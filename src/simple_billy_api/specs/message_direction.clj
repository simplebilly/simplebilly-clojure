(ns simple-billy-api.specs.message-direction
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def message-direction-data
  {
   })

(def message-direction-spec
  (ds/spec
    {:name ::message-direction
     :spec message-direction-data}))
