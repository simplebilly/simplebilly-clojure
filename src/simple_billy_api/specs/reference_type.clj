(ns simple-billy-api.specs.reference-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def reference-type-data
  {
   })

(def reference-type-spec
  (ds/spec
    {:name ::reference-type
     :spec reference-type-data}))
