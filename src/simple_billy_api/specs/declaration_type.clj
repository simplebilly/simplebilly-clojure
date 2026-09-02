(ns simple-billy-api.specs.declaration-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def declaration-type-data
  {
   })

(def declaration-type-spec
  (ds/spec
    {:name ::declaration-type
     :spec declaration-type-data}))
