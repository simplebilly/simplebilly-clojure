(ns simple-billy-api.specs.institute-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def institute-type-data
  {
   })

(def institute-type-spec
  (ds/spec
    {:name ::institute-type
     :spec institute-type-data}))
