(ns simple-billy-api.specs.training-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def training-source-data
  {
   })

(def training-source-spec
  (ds/spec
    {:name ::training-source
     :spec training-source-data}))
