(ns simple-billy-api.specs.gateway-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def gateway-type-data
  {
   })

(def gateway-type-spec
  (ds/spec
    {:name ::gateway-type
     :spec gateway-type-data}))
