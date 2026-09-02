(ns simple-billy-api.specs.message-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def message-type-data
  {
   })

(def message-type-spec
  (ds/spec
    {:name ::message-type
     :spec message-type-data}))
